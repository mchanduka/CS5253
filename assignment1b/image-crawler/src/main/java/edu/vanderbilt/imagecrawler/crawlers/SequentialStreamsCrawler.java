package edu.vanderbilt.imagecrawler.crawlers;

import static edu.vanderbilt.imagecrawler.utils.Crawler.Type.IMAGE;
import static edu.vanderbilt.imagecrawler.utils.Crawler.Type.PAGE;

import java.net.URL;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import edu.vanderbilt.imagecrawler.utils.Crawler;
import edu.vanderbilt.imagecrawler.utils.Image;
import edu.vanderbilt.imagecrawler.utils.WebPageElement;

/**
 * This class uses Java sequential streams features to perform an
 * "image crawl" starting from a root Uri. Images from HTML pages
 * reachable from the root Uri are downloaded from a remote web server
 * or the local file system and the results are stored in files that
 * are displayed to the user. All stream operations are performed
 * sequentially in a single thread of control.
 */
@SuppressWarnings("unchecked")
public class SequentialStreamsCrawler // Loaded via reflection
       extends ImageCrawler {
    /**
     * Recursively crawls the given page and returns the total number
     * of processed images.
     *
     * @param pageUri The URI that's being crawled at this point
     * @param depth   The current depth of the recursive processing
     * @return The count of the number of images processed at this depth
     */
    @Override
    protected int performCrawl(String pageUri, int depth) {
        // Throw an exception if the the stop crawl flag has been set.
        throwExceptionIfCancelled();

        log("[" + Thread.currentThread().getName()
            + "] Crawling " + pageUri + " (depth " + depth + ")");

        // Create and use a Java sequential stream to:
        // 1. Use a factory method to create a one-element stream
        //    containing just the pageUri.
        // 2. Use an intermediate operation to filter out pageUri if
        //    it exceeds max depth or if it was already visited.
        // 3. Use an intermediate operation to call the crawlPage()
        //    method and return the total number of processed images.
        // 4. Use a terminal operation to get the total number of
        //    processed images from the one-element stream.

        // TODO -- you fill in here replacing this statement with your
        // solution.
        return 0;
    }

    /**
     * Uses Java streams features to (1) download and process images
     * on this page via processImage(), (2) recursively crawl other
     * hyperlinks accessible from this page via performCrawl(), and
     * (3) return a sum of all the image counts.
     *
     * @param pageUri The page uri to crawl
     * @param depth   The current depth of the recursive processing
     * @return The number of processed images
     */
    protected int crawlPage(String pageUri, int depth) {
        log("[" + Thread.currentThread().getName()
            + "] Crawling " + pageUri + " (depth " + depth + ")");

        // Create and use a Java sequential stream to:
        // 1. Use a factory method to create a one-element stream
        //    containing just the pageUri.
        // 2. Get the HTML page associated with the pageUri param.
        // 3. Filter out a missing (i.e., null) HTML page.
        // 4. Call processPage() to process images encountered during
        //    the crawl.
        // 5. Use a terminal operation to get the total number of
        //    processed images from the one-element stream.

        // Return the count of all the images downloaded, processed,
        // and stored.
        // TODO -- you fill in here replacing this statement with your
        // solution.
        return 0;
    }

    /**
     * Use a Java sequential stream to (1) download and process images
     * on this page via processImage(), (2) recursively crawl other
     * hyperlinks accessible from this page via performCrawl(), and
     * (3) return the sum of all images processed during the crawl.
     *
     * @param page  The page containing HTML
     * @param depth The current depth of the recursive processing
     * @return The count of the number of images processed
     */
    protected int processPage(Crawler.Page page,
                              int depth) {
        // Perform the following steps:
        // 1. Get a sequential stream containing all the image/page
        //    elements on this page.
        // 2. Map each web element into the count of images produced
        //    by either processing an image or by crawling a page.
        // 3. Sum all the results together.

        // Return a count of of all images processed on/from this page.
        // TODO -- you fill in here replacing this statement with your
        // solution.
        return 0;
    }

    /**
     * Process an image by applying transformations that have not
     * already been applied and cached.
     *
     * @param imageUrl An image url
     * @return The count of transformed images
     */
    protected int processImage(URL imageUrl) {
        // Create and use a Java sequential stream to:
        // 1. Use a factory method to create a one-element stream
        //    containing just the url.
        // 2. Get or download the image from the given url.
        // 3. Filter out a missing (i.e., null) page.
        // 4. Transform the image and return a count of the number of
        //    transforms applied.
        // 5. Sum the number of images that were processed.

        // TODO -- you fill in here replacing this statement with your
        // solution.
        return 0;
    }

    /**
     * Route the request to transform an {@code image} to either a
     * local or remote transformer.
     *
     * @param image The image to transform
     * @return The count of the non-null transformed images
     */
    protected int transformImage(Image image) {
        // Check a flag to determine if transforms should be run
        // remotely on a remote server using microservices or locally.
        return runRemoteTransforms()
            ? transformImageRemotely(image)
            : transformImageLocally(image);
    }

    /**
     * Locally applies the current set of crawler transforms on the
     * passed {@link Image} and returns a count of all successfully
     * transformed images.
     *
     * @param image The {@link Image} to transform locally
     * @return The count of the non-null transformed images
     */
    protected int transformImageLocally(Image image) {
        // Create and use a Java sequential stream as follows:
        // 1. Convert the List of transforms into a sequential stream.
        // 2. Attempt to create a new cache item for each image,
        //    filtering out any image that has already been locally
        //    cached.
        // 3. Apply each transform to the original image to produce a
        //    transformed image.
        // 4. Filter out any null images that weren't transformed.
        // 5. Count the number of non-null images that were transformed.

        // TODO -- you fill in here replacing this statement with your
        // solution.
        return 0;
    }

    /**
     * Calls remote server to perform transforms on the passed {@link
     * Image} and return a count of all successfully transformed
     * images.
     *
     * @param image The {@link Image} to transform remotely
     * @return The count of the non-null transformed images
     */
    protected int transformImageRemotely(Image image) {
        // Perform all transform operations and then return the number
        // of transformed images as follows:
        // 1. Call getRemoteDataSource() to get a proxy to the server.
        // 2. Call a RemoteDataSource helper method to apply all
        //    transforms on the image remotely.
        // 3. Convert the List of resulting transformed images
        //    into a Stream.
        // 4. Call createImage() to convert the received
        //    TransformedImage to a locally cached Image.
        // 5. Skip null images.
        // 6. Return the count of the number of transformed images.

        // TODO -- you fill in here replacing this statement with your
        // solution.
        return 0;
    }
}
